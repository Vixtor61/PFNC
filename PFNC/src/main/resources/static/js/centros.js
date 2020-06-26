
app = {
    init: function () {
        this.onChangeSelect();
    },

 onChangeSelect: function() {
    document.getElementById('municipio_select_id').addEventListener('change', function() {
        console.log('You selected: ', this.value);

        let url=`/getCentrosbyMunicipio?municipioId=${this.value}`

      fetch(url)
                                .then(res => res.json())
                                .then(data => {
                                    var select = document.getElementById("centro_id_select");
                                    select.options.length = 0;
                                    select.add(new Option("Select an Option", "none", true,));
                                    select.options[0].disabled = true
                                    select.options[0].hidden = true
                              
                                   
                                    data.forEach(element => {
                                        console.log(element.nombre);
                                        select.add(new Option(element.nombre,element.centroEscolarId));
                                    });
                                    console.log(data);
                                    
        });
      });
}
};

window.onload = () => app.init();
