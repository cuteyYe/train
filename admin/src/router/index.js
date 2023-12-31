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
    },{
        path: 'business/',
        children: [{
            path: 'confirm-order',
            component: () => import('../views/main/business/confirm-order')
        },{
            path: 'daily-train',
            component:() => import('../views/main/business/daily-train')
        },{
            path: 'daily-train-station',
            component:() => import('../views/main/business/daily-train-station')
        },{
            path: 'daily-train-carriage',
            component:() => import('../views/main/business/daily-train-carriage')
        },{
            path: 'daily-train-seat',
            component:() => import('../views/main/business/daily-train-seat')
        },{
            path: 'daily-train-ticket',
            component:() => import('../views/main/business/daily-train-ticket')
        },{
            path: 'sk-token',
            component:() => import('../views/main/business/sk-token')
        }]
    },{
        path: 'member/',
        children: [{
            path: 'ticket',
            component:() => import('../views/main/member/ticket')
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
