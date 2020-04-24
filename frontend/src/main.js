import Vue from 'vue'
import App from './App.vue'
import VueChartkick from "vue-chartkick";
import Chart from 'chart.js'



Vue.use(VueChartkick.use(Chart))
Vue.config.productionTip = false

new Vue({
  render: h => h(App),

}).$mount('#app')
