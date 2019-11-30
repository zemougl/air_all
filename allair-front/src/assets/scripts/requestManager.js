export default class RequestManager {
    constructor () {
      this.urlHttp = 'http://localhost:8080/'
      this.header = {
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': '*'
      }
    }
  
    send (requestData, service, requestMethod) {
      this.url = this.urlHttp + '/' + service
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
      return requestManager.send(requestData, service, method)
    }
  }