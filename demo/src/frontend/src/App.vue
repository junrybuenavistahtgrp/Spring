<template>
	<div id="app">
		<TeslaCar />
	</div>
  
</template>

<script>
import TeslaCar from './components/TeslaCar.vue'

export default {
  name: 'App',
  components: {
    TeslaCar
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>