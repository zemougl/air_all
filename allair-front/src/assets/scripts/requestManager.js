export default class RequestManager {
    constructor () {
      this.urlHttps = 'https://localhost:9443/'
      this.urlHttp = 'http://localhost:8080/'
      this.apiName = 'allair-api'
      this.header = {
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': '*'
      }
      this.url = this.urlHttps + this.apiName
    }
  
    testDispo () {
      return fetch(this.url + '/dispo', {
        method: 'GET',
        headers: this.header,
        mode: 'cors'
      })
    }
  
    send (requestData, service, requestMethod) {
      this.url = this.url + '/' + service
      this.requestContent = this.getRequestContent(requestData, requestMethod)
      return fetch(this.url, this.requestContent)
    }
  
    getRequestContent (requestData, requestMethod) {
      if (requestData) {
        return {
          method: requestMethod,
          headers: this.header,
          mode: 'cors',
          body: JSON.stringify(requestData)
        }
      } else {
        return {
          method: requestMethod,
          headers: this.header,
          mode: 'cors'
        }
      }
    }
  
    static getResponse (requestData, service, method) {
      let requestManager = new RequestManager()
      requestManager.testDispo()
        .then(response => {
          response.json().then(data => {
            console.log('service disponible en https' + data)
          })
        })
        .catch(error => {
          console.log(error)
          console.log('Le serveur n\'est pas joignale en https alors le serveur fonctionne en mode dégradé, Merci de votre compréhension')
          this.url = this.urlHttp + this.apiName
        })
      return requestManager.send(requestData, service, method)
    }
  }