<template>
  <div id="app">
    <img alt="all-r app" src="@/assets/logo.png" class="logo">
    <Home/>
  </div>
</template>

<script>
import Home from '@/components/Home.vue'

export default {
  name: 'Acceuil',
  components: {
    Home
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  margin-top: 60px;
}
</style>