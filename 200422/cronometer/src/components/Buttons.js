import React from "react";
import axios from "axios";

export class Buttons extends React.Component {
    state = {
        user: Object
    }

    getData() {
        let id = this.createData();
        axios.get(`http://localhost:8080/api/${id}`)
          .then(res => {
            const user = res.data;
            this.setState({ user });
          })
    }

    execute() {
        let today = new Date();
        let h = String(today.getHours());
        let m = String(today.getMinutes());
        let s = String(today.getSeconds());
        document.getElementById("screen").innerHTML = h + ":" + m + ":" + s;
    }

    createData() {
        let id = prompt("Write id for user:");
        let name = prompt("Write name for user:");
        let surname = prompt("Write surname for user:");
        let nick = prompt("Write nick for user:");
        let age = prompt("Write age for user:");

        const user = {
            id: id,
            name: name,
            surname: surname,
            nick: nick,
            age: age
        };

        axios.post(`http://localhost:8080/api/user`, user)
        .then(res => {
          console.log(res.data);
        })

        return id;
    }

    render() {
        return (
            <div>
                <div id="screen">Counter</div>
                User name: {this.state.user.name}
                User surname: {this.state.user.surname}
                User nick: {this.state.user.nick}
                User age: {this.state.user.age}
                <button type="button" onClick={()=>{ this.getData(); this.execute(); this.createData() }}>Start</button>
                <button type="button" onClick={()=>{ this.getData(); this.execute(); this.createData() }}>Stop</button>
            </div>
        );
    }
}