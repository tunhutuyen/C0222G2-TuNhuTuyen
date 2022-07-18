$(document).ready(function () {
    $("#serviceType").change(function () {
        let temp = $("#serviceType").val();
        switch (Number(temp)) {
            case 1:
                $("#divStandardRoom").show();
                $("#divDescriptionOtherConvenience").show();
                $("#divNumberOfFloors").show();
                $("#divPoolAreaVilla").show();
                $("#divFacilityFree").hide();
                break;
            case 2:
                $("#divStandardRoom").show();
                $("#divDescriptionOtherConvenience").show();
                $("#divNumberOfFloors").show();
                $("#divPoolAreaVilla").hide();
                $("#divFacilityFree").hide();
                break;
            case 3:
                $("#divStandardRoom").hide();
                $("#divDescriptionOtherConvenience").hide();
                $("#divNumberOfFloors").hide();
                $("#divPoolAreaVilla").hide();
                $("#divFacilityFree").show();
                break;
            default:
                $("#divStandardRoom").hide();
                $("#divDescriptionOtherConvenience").hide();
                $("#divNumberOfFloors").hide();
                $("#divPoolAreaVilla").hide();
                $("#divFacilityFree").hide();
                break;
        }
    })
    $("#divStandardRoom").hide();
    $("#divDescriptionOtherConvenience").hide();
    $("#divNumberOfFloors").hide();
    $("#divPoolAreaVilla").hide();
    $("#divFacilityFree").hide();
})