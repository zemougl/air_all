<template>
<div>
    <img alt="all-r app" src="@/assets/logo.png" class="logo">
    <div class="premierspas">
            <button>
                Comment recharger un scoot'Air ?
            </button>
        
            <button>
                Comment brancher un concentrateur sur un scoot'Air en cas d'urgence ?
            </button>
        
            <button>
                Comment déveroullier un scoot'Air ?
            </button>
       
            <button>
                Comment utiliser un scoot'Air ?
            </button>
            <router-link to="/Acceuil"><button title="retour" class="retour" /></router-link>
    </div>
</div>
</template>
<script>
export default {
  name: 'PremiersPas'
}
</script>