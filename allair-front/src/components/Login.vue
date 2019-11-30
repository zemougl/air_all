<template>
  <div id="app">
    <img alt="all-r app" src="@/assets/logo.png" class="logo">
     <div class="formulaire">
         <input class="entree" type="email" placeholder="Adresse mail" autofocus="" v-model="this.client.login">
         <input class="entree" type="password" placeholder="Mot de passe" v-model="this.client.pass">
         <br/>
        <button  title="s'identifier" class="profile" @click="connection()">Connection</button>
     </div>
  </div>
</template>
<script>
import RequestManager from '@/assets/scripts/requestManager.js'
export default {
    name: 'login',
    data: function () {
        return {
            client: {login: 'marie-jo', pass: 'test'}
        }
    },
    methods: {
        connection () {
            RequestManager.getResponse(this.client, 'connection', 'POST')
                    .then(response => {
                        console.log(response)
                        this.$router.push({path: '/Acceuil'})
                    })
                    .catch(error => {
                        console.log('service /connection ko : ' + error)
                    })
        }
    }
}
</script>
