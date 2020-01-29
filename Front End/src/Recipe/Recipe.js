import React from 'react';
import classes from'./Recipe.css'

const recipe = (props) => {
    return (
        <div className={classes.Recipe}>
            <img src={props.image} alt="new" />
            <p onClick={props.click} >{props.name}</p>
            <p>{props.children}</p>
        </div>
    )
};

export default recipe;