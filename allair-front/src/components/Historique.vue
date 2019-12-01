<template>
<div>
    <img alt="all-r app" src="@/assets/logo.png" class="logo">
    <div class="formulaire">
        <ul>
            <h1>Historique</h1>
            <li v-for="location in locations"  :key="location.id"> 
                client : {{ location.idClient }} <br/> 
                scoot'air : {{ location.idEngine }} <br/>  
                début : {{ location.dateDebut }} <br/> 
                fin : {{ location.dateFin }} <br/> 
            </li>
        </ul>
        <ul>
            <h1>Problèmes rencontrés</h1>
            <li v-for="p in sav"  :key="p.idEngine"> 
                scoot'air : {{ p.idEngine }} <br/>  
                message : {{ p.messageUsr }} 
            </li>
        </ul>
        <router-link to="/Acceuil"><button title="retour" class="retour" /></router-link>
    </div>
</div>
</template>
<script>
import RequestManager from '@/assets/scripts/requestManager.js'
export default {
  name: 'Historique',
  data: function() {
    return {
        locations: {},
        sav: {}
    }      
  },
  mounted: function() {
      RequestManager.getResponse(null, 'historique', 'GET')
      .then(response => {
        response.json().then(data => {
          console.log(data)
          this.locations = data
        })
      })
      .catch(error => {
        console.log('service /historique ko : ' + error)
      })

      RequestManager.getResponse(null, 'sav', 'GET')
      .then(response => {
        response.json().then(data => {
          console.log(data)
          this.sav = data
        })
      })
      .catch(error => {
        console.log('service /sav ko : ' + error)
      })
  }
}
</Script>