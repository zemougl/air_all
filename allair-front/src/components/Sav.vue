<template>
<div>
    <img alt="all-r app" src="@/assets/logo.png" class="logo">
    <div class="formulaire">
        <textarea class="entree" style="height: 300px;"/>
        <p>
        <button @click="soumettre()" title="valider" class="valider"/>
        <router-link to="/Acceuil"><button title="retour" class="retour" /></router-link>
        </p>
    </div>
</div>
</template>
<script>
export default {
  name: 'Sav',
  methods: {
      soumettre() {

      }
  }
}
</script>