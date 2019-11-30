<template>
  <div>
    <div class="menubar">
      <router-link to="/EngineRent"><button  title="louer un scooter">Commander</button></router-link>
      <router-link to="/Sav"><button title="SAV">SAV</button></router-link>
      <router-link to="/PremiersPas"><button title="Aide">Premiers pas</button></router-link>
    </div>
    <div class="conteneur">
      <img src="@/assets/images/body.png" class="corps">
    </div>
    <div class="footer">
      <router-link to="/Acceuil">
       <img src="@/assets/images/urgence.png"/>
      </router-link>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Home'
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
