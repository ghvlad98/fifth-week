setInterval(function() {
    var end = new Date("Jan 1, 2023 00:00:00").getTime();
    const today = new Date().getTime();
    const diff = end - today;
    const dTimeInMs = 1000 * 60 * 60 * 24;
    const hTimeInMs = 1000 * 60 * 60;
    const mTimeInMs = 1000 * 60;
    const d = Math.floor(diff / dTimeInMs);
    const h = Math.floor((diff % dTimeInMs) / hTimeInMs);
    const m = Math.floor((diff % hTimeInMs) / mTimeInMs);
    const s = Math.floor((diff % mTimeInMs) / 1000);

    document.getElementById("counter").innerHTML = d + "giorni " + h + "h "
    + m + "m " + s + "s ";
}, 1000);

setInterval();