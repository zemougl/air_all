import EngineRent from '@/components/EngineRent'
import Acceuil from '@/components/Acceuil'
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
      path: '/',
      name: 'Acceuil',
      component: Acceuil
    },
    {
      path: '*',
      redirect: '/'
    }
  ]
})