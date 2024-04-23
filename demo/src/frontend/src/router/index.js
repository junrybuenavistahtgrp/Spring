import 'bootstrap/dist/css/bootstrap.min.css'
import { createWebHistory, createRouter } from "vue-router";
import PostCar from '../components/PostCar'
import TeslaCar from '../components/TeslaCar'
import PageNotFound from '../error/PageNotFound'

const routes = [
  {
    path: "/save",
    name: "Save",
    component: PostCar,
  },
   {
    path: "/cars",
    name: "Cars",
    component: TeslaCar,
  },
  {
  path: "/:catchAll(.*)",
  component: PageNotFound,
},
 
];

const router = createRouter({
  history: createWebHistory(),
  routes,
  
});

export default router;


