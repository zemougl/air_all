import EngineRent from '@/components/EngineRent'
import Acceuil from '@/components/Acceuil'
import PremiersPas from '@/components/PremiersPas'
import Sav from '@/components/Sav'
import Login from '@/components/Login'
import Historique from '@/components/Historique'
import Vue from 'vue'
import Router from 'vue-router'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/EngineRent',
      name: 'EngineRent',
      component: EngineRent
    },
    {
      path: '/Acceuil',
      name: 'Acceuil',
      component: Acceuil
    },
    {
      path: '/PremiersPas',
      name: 'PremiersPas',
      component: PremiersPas
    },
    {
      path: '/Sav',
      name: 'Sav',
      component: Sav

    },
    {
      path: '/',
      name: 'Login',
      component: Login

    },
    {
      path: '/Historique',
      name: 'Historique',
      component: Historique

    },
    {
      path: '/',
      name: 'Login',
      component: Login

    },
    {
      path: '*',
      redirect: '/Acceuil'
    }
  ]
})
