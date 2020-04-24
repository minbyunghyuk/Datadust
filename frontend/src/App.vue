<template>
    <div id="app">
        <img alt="Vue logo" src="./assets/logo.png">

        <line-chart :data="chartData"></line-chart>
        <pie-chart :data="[['Nokia',150],['한글',120]]"></pie-chart>

        <button @click="updateChart">updatedata</button>
        <button v-on:click="fetchData">get data</button>
    </div>
</template>

<script>
    import axios from 'axios'

    export default {


        name: 'app',
        result_itemList: [],

        data() {
            return {

                chartData: {
                    '2017-05-13': 2,
                    '2017-05-14': 5,
                    '2017-05-15': 4
                },
                fetchData: function () {
                    axios.get('http://localhost:8081/re/list')
                   // fetch('http://localhost:8080/re/list')
                        .then(response => {
                            // handle success
                            this.result_itemList =response.data;
                            console.log(response.data, this);
                            console.log(this.result_itemList)

                        })
                        .catch(function (error) {
                            console.log(error);
                        });
                }

            }
        },
        methods: {
            updateChart() {
                this.chartData = {
                    '2017-05-13': 1,
                    '2017-05-14': 15,
                    '2017-05-15': 11
                }
            }

        },
        template:`
            <div>
                <li v-for="item in result_itemList" v-bind:key="item">{{item.potato_price}} {{item.exchange_Rate}}</li>
            </div>
        `

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
