<template>
	<div class="container">
		<h1 class = "text-center">Car list</h1>
		<table class="table table-striped">
			<thead>
				<th>Id</th>
				<th>Model</th>
				<th>Color</th>
			</thead>
			<tbody>
				<tr v-for = "car in cars" v-bind:key = "car.id">
					<td>{{ car.id }}</td>
					<td>{{ car.model }}</td>
					<td>{{ car.color }}</td>
				</tr>
			</tbody>
		</table>
	</div>
</template>

<script>
import CarService from "./services/CarService";

	export default{
		name:'TeslaCars',
		data(){
			return{
				cars: []
			}
			
		},
		methods:{
			getCars(){
				CarService.getCars().
				then((response)=>{
					this.cars = response.data;
				});
			}
		},
		created(){
			this.getCars();
		}
		
	}
</script>