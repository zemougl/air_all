<template>
<div>
    <img alt="all-r app" src="@/assets/logo.png" class="logo">
    <div class="formulaire">
        <div v-html="this.maPosition" />
        <textarea class="entree" style="height: 300px;"/>
        <p>
        <button @click="soumettre()" title="valider" class="valider"/>
        <router-link to="/Acceuil"><button title="retour" class="retour" /></router-link>
        </p>
    </div>
</div>
</template>
<script>
import geoManager from '@/assets/scripts/geoManager.js'
export default {
  name: 'Sav',
  data: function() {
    return {
        maPosition: '' 
    }      
  },
  methods: {
      soumettre() {

      }
  },
  mounted() {
      this.maPosition = geoManager.geolocalisation().getCurrentPosition(position => {
            this.maPosition = ' Votre localisation : ' + position.coords.latitude + ' | ' + position.coords.longitude;
      });
  }
}
</script>