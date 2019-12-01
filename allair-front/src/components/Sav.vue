<template>
<div>
    <img alt="all-r app" src="@/assets/logo.png" class="logo">
    <div class="formulaire">
        <div v-html="this.maPosition" />
        <textarea class="entree" style="height: 300px;" v-model="sav.messageUsr"/>
        <p>
        <button @click="soumettre()" title="valider" class="valider"/>
        <router-link to="/Acceuil"><button title="retour" class="retour" /></router-link>
        </p>
    </div>
</div>
</template>
<script>
import geoManager from '@/assets/scripts/geoManager.js'
import RequestManager from '@/assets/scripts/requestManager.js'
export default {
  name: 'Sav',
  data: function() {
    return {
        maPosition: '',
        sav: {idEngine: null, messageUsr: ''}
    }      
  },
  methods: {
      soumettre() {
        this.sav.messageUsr = this.sav.messageUsr + ', ' + this.maPosition
        RequestManager.getResponse(this.sav, 'warn', 'POST')
        .then(response => {
            console.log(response)
            this.sav = {}
            this.$router.push({path: '/Acceuil'})
        })
        .catch(error => {
          console.log('service /warn ko' + error)
        })
      }
  },
  mounted() {
      this.maPosition = geoManager.geolocalisation().getCurrentPosition(position => {
            this.maPosition = ' Votre localisation : ' + position.coords.latitude + ' | ' + position.coords.longitude;
      });
  }
}
</script>