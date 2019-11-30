<template>
  <div id="app">
    <img alt="all-r app" src="@/assets/logo.png" class="logo">
     <div class="formulaire">
        <router-link to="/Acceuil"><button  title="s'identifier" class="profile"/></router-link>
     </div>
     <div class="formulaire">
         <router-link to="/Acceuil"><button  title="s'inscrire" class="inscription"/></router-link>
     </div>
  </div>
</template>
<script>
export default {
    name: 'login',
}
</script>
