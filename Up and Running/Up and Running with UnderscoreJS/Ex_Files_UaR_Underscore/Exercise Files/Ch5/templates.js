    var studentInfoTable = "<table><thead><th>Last Name</th><th>First Name</th><th>School</th><th>Grade</th><th>Overall Score</th>" + 
                      "</thead><tbody>" +
                      "<% _.each(dataset, function(item) { %>" + 
                      "<tr class='studentRec " +
                        "<% (item.overall_score >= 65) ? print('passingStudent') : print('failingStudent') %>'>" +
                        "<td class='lastname'><%= item.lastname %></td><td class='firstname'><%= item.firstname %> </td>" +
                        "<td class='school'><%= item.school %></td><td class='grade'><%= item.grade %></td>" +
                        "<td class='score'><%= item.overall_score %></td></tr>" +
                      "<% }); %>" +
                      "</tbody></table>";

    var studentInfoCards = "<% _.each(dataset, function(item) { %>" + 
                          "<div class='studentCard " +
                            "<% (item.overall_score >= 65) ? print('passingStudent') : print('failingStudent') %>'>" +
                            "<div class='particulars'> " + 
                              "<span class='cardName'>Name: </span><span><%= item.lastname %>, <%= item.firstname%> </span>" +
                              "<span class='cardGrade'>Grade: <%= item.grade %></span>" +
                              "<div class='cardScores'>" + 
                                "<div>School: <%= item.school %></div>" +
                                "<div>Midterm Score: <%= item.midterm_score %></div>" +
                                "<div>Final Score: <%= item.final_score %></div>" +
                                "<div>Overall Score: <%= item.overall_score %></div>" +
                              "</div>" +
                            "</div>" +
                          "</div>" +
                          "<% }); %>";
