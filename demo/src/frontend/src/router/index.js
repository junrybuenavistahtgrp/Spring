import 'bootstrap/dist/css/bootstrap.min.css'
import { createWebHistory, createRouter } from "vue-router";
import PostCar from '../components/PostCar'
import TeslaCar from '../components/TeslaCar'

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
 
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;


