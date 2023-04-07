"use strict";
const response = await fetch("landen/aantal");
if (response.ok) {
    const aantal = await response.text();
    document.getElementById("aantal").innerText = aantal;
} else {
    alert("Technisch probleem");
}