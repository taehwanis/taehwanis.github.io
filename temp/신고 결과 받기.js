function solution(id_list, report, k) {
    const [usedObj, cntObj] = [{}, {}];

    const idObj = id_list.forEach(id => {
        usedObj[id] = [];
        cntObj[id] = 0;
    });

    report.forEach(el => {
        const [reporter, troller] = el.split(' ');
        if (!usedObj[reporter].includes(troller)) {
            usedObj[reporter].push(troller);
            cntObj[troller]++;
        }
    });

    return id_list.map(el =>
        usedObj[el].reduce((acc, id) => cntObj[id] >= k ? acc + 1 : acc, 0)
    );
}