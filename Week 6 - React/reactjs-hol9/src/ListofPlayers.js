import React from "react";

const players = [
    {name:"Sachin",score:95},
    {name:"Dhoni",score:85},
    {name:"Virat",score:90},
    {name:"Rohit",score:60},
    {name:"Gill",score:65},
    {name:"Rahul",score:72},
    {name:"Hardik",score:50},
    {name:"Jadeja",score:69},
    {name:"Pant",score:80},
    {name:"Shami",score:55},
    {name:"Bumrah",score:88}
];

export default players;

export function ListofPlayers(props)
{
    return(
        <div>
            {
                props.players.map((item,index)=>
                <li key={index}>
                    {item.name} : {item.score}
                </li>)
            }
        </div>
    )
}

export function Scorebelow70(props)
{
    let players70=[];

    props.players.map((item)=>
    {
        if(item.score<=70)
        {
            players70.push(item);
        }
        return null;
    });

    return(
        <div>
            {
                players70.map((item,index)=>
                <li key={index}>
                    {item.name} : {item.score}
                </li>)
            }
        </div>
    )
}