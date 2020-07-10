
app = {
    init: function () {
        this.onChangeSelect();
    },

 onChangeSelect: function() {
    document.getElementById('deptSelect').addEventListener('change', function() {
        console.log('You selected: ', this.value);

        let url=`/api/getMunicipiosByDept?departamentoId=${this.value}`

      fetch(url)
                                .then(res => res.json())
                                .then(data => {
                                    var select = document.getElementById("muniSelect");
                                    select.options.length = 0;
                                    select.add(new Option("Select an Option", "none", true,));
                                    select.options[0].disabled = true
                                    select.options[0].hidden = true
                              
                                   
                                    data.forEach(element => {
                                        console.log(element.nombre);
                                        select.add(new Option(element.nombre,element.municipioId));
                                    });
                                    console.log(data);
                                    
        });
      });
}
};

window.onload = () => app.init();
