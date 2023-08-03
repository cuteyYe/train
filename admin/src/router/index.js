import { createRouter, createWebHistory } from 'vue-router'


const routes = [
   {
    path: '/',
    component: () => import('../views/main.vue'),
    children:[{
      path:'welcome',
      component:() => import('../views/main/welcome')
    },{
      path: 'about',
      component:() => import('../views/main/about')
    },{
        path: 'base/',
        children: [{
            path: 'station',
            component:() => import('../views/main/base/station')
        },{
            path: 'train',
            component:() => import('../views/main/base/train')
        },{
            path: 'train-station',
            component:() => import('../views/main/base/train-station')
        },{
            path: 'train_carriage',
            component:() => import('../views/main/base/train-carriage')
        },{
            path: 'train_seat',
            component:() => import('../views/main/base/train-seat')
        }]
    },{
        path: 'batch/',
        children: [{
            path: 'job',
            component:() => import('../views/main/batch/job')
        }]
    }]
  }, {
    path:'',
    redirect:'/welcome'
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})


export default router
