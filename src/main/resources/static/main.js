const app = new Vue({
    el:"#app",
    data:{
        items:[],
    },
    mounted(){
        //   fetch('http://localhost:8080/getid')
        //     .then(response => response.json())
        //   .then((data)=>{
        //     this.items = data;
        // });
        fetch('http://localhost:8080/re/list')
            .then(response => response.json())
            .then((data)=> {
                this.items = data;
            })

    },
    template:
        `<div>
      <li v-for="item in items"><p>{{item.date}}</p>
        <p>{{item.kospi}}</p> </li>
        
    </div>`

});


