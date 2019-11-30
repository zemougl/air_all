export default class CustomDay {
    constructor (year, month, day) {
      this.year = year
      this.month = month
      this.day = day
      this.start = new Date(this.year, this.month, this.day)
      this.monthName = this.start.toLocaleDateString('fr-fr', {month: 'long'})
    }
  
    getMonthName () {
      return this.monthName
    }
  
    getName () {
      return 'Le ' + this.start.getDate() + '/' + this.start.getMonth() + '/' + this.start.getFullYear()
    }
  
    getTimestemp () {
      return this.start.getTime()
    }
  
    static constructDays (today) {
      var tempDate = today
      let selectedDays = []
      for (let i = 0; i < 15; i++) {
        selectedDays.push(new CustomDay(tempDate.getFullYear(), tempDate.getMonth(), tempDate.getDate()))
        tempDate = new Date(tempDate.setDate(tempDate.getDate() + 1))
      }
      return selectedDays
    }
  }