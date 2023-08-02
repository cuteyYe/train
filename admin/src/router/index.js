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
        path: 'station',
        component:() => import('../views/main/station')
    },{
        path: 'train',
        component:() => import('../views/main/train')
    },{
        path: 'train-station',
        component:() => import('../views/main/train-station')
    },{
        path: 'train_carriage',
        component:() => import('../views/main/train-carriage')
    },{
        path: 'train_seat',
        component:() => import('../views/main/train-seat')
    }]
  },
  {
    path:'',
    redirect:'/welcome'
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})


export default router
