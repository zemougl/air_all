export default class SmsManager {
    constructor (toNumber, fromNumber, message) {
      this.url = 'xx'
      this.auth = 'xx'
      this.headerSMS = {
        'Content-Type': 'application/x-www-form-urlencoded',
        'Authorization': 'Basic ' + btoa(this.auth)
      }
      this.bodySMS = 'To=' + toNumber + '&From=' + fromNumber + '&Body=' + message
      this.smsRequest = {
        method: 'POST',
        headers: this.headerSMS,
        mode: 'cors',
        body: this.bodySMS
      }
    }
  
    send () {
      fetch(this.url, this.smsRequest)
        .then(response => {
          console.log('messsage envoyé avec succès')
          alert('Votre message a été pris en compte')
        })
        .catch(error => {
          console.log('une erreur est survenue : ' + error)
          alert('/!\\Un problème est survenue lors de l\'envoie du message')
        })
    }
  
    static meContacter (message) {
      let smsManager = new SmsManager('numero1', 'numero2', message)
      smsManager.send()
    }
  }