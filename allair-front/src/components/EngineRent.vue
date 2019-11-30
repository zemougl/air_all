<template>
<div>
  <img alt="all-r app" src="@/assets/logo.png" class="logo">
  <div class="formulaire">
    <datetime v-model="location.dateDebut" input-class="entree" type="datetime" format="dd/MM/yyyy HH:mm"  placeholder="Début"></datetime>
    <datetime v-model="location.dateFin" input-class="entree" type="datetime" format="dd/MM/yyyy HH:mm"  placeholder="Fin"></datetime>
    <p>
    <button @click="louer()" title="valider" class="valider"/>
    <router-link to="/Acceuil"><button title="retour" class="retour" /></router-link>
    </p>
  </div>
</div>
</template>
<script>
import { Datetime } from 'vue-datetime'
import { Settings } from 'luxon'
import moment from 'moment'
import RequestManager from '@/assets/scripts/requestManager.js'
Settings.defaultLocale = 'fr'
export default {
  name: 'EngineRent',
  components: { datetime: Datetime },
  data: function () {
    return {
      location: {}
    }
  },
  methods: {
    louer () {
      this.location.dateDebut = this.formatGivenDate(this.location.dateDebut)
      this.location.dateFin = this.formatGivenDate(this.location.dateFin)
      RequestManager.getResponse(this.location, 'louer', 'POST')
        .then(response => {
          response.json().then(data => {
            console.log(data)
            this.location = {}
          })
        })
        .catch(error => {
          console.log('service /louer ko' + error)
        })
    },
    formatGivenDate (date) {
      return moment(date).format('DD/MM/YYYY HH:mm')
    }
  }
}
</script>