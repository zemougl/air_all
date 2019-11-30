import './assets/styles/main.css'


import Vue from 'vue'
import App from './App.vue'
import router from './router/router'
import axios from 'axios'
import VueAxios from 'vue-axios'
import Cors from 'cors'
// You need a specific loader for CSS files
import './../node_modules/vue-datetime/dist/vue-datetime.css'

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
