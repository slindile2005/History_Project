package com.example.historyproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.historyproject.R.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val editTextText = findViewById<EditText>(R.id.editTextText)
        val button1 = findViewById<Button>(R.id.button1)
        val ClearButton = findViewById<Button>(R.id.ClearButton)

        ClearButton.setOnClickListener { editTextText.text.clear() }


        button1.setOnClickListener {
            val editTextText = editTextText.text.toString()


             if (editTextText == "20"){
                textView.text = "XXXTENTACION, Collaborator with the music Members Only who became known for songs such as Look at Me, died at 18 June 2018"

            } else if (editTextText == "21"){
                textView.text = "Lil Peep, Notable for his digitally released projects Hellboy and Live Forever, died at 15 Nov 2017"

            } else if (editTextText == "22") {
                textView.text =
                    "Alonzo Howard,The Instagram sensation who rose to fame in the summer of 2016 by creating dubsmash and dance challenge videos, died at 6 July 2022 "
            } else if (editTextText == "23") {
                textView.text =
                    "Selena Quintanilla, Iconic Texan singer known as the Queen of Tejano Music, died at 31 March 1995"
            } else if (editTextText == "24") {
                textView.text =
                    "NOTORIUS B.I.G., He is considered to be one of the greatest rappers of all time, died at 9 March 1997"
            } else if (editTextText == "25") {
                textView.text =
                    "Tupac Shakur, He was known as one of the most notable figures in the 1990's East Coast hip hop rivalry, died at 13 September 1996"
            } else if (editTextText == "26") {

            } else if (editTextText == "27"){
                textView.text = "Amy Winehouse, Five-time Grammy Award Winner and soul singer icon whose album ,Back to Back, became the best-selling album, died at 23 July 2011 "

            } else if (editTextText == "28") {
                textView.text =
                    "Takeoff, Known as the youngest member of the hip hop trio Migos, died at 1 November 2022 "

            } else if (editTextText == "29") {
                textView.text =
                    "Rani Lakshmibai, Former Queen of the state of Jhansi located in India, died at 18 June 1858"

            } else if (editTextText == "30") {
                textView.text =
                    "Cheslie Kryst, Beauty pageant titleholder crowned Miss USA 2019 after previously being named Miss North Carolina USA 2019, died at 30 January 2022"

            } else if (editTextText == "31") {
                textView.text =
                    "John Kennedy Toole, Author of the picaresque novel , died at 26 March 1969"

            } else if (editTextText == "32") {
                textView.text =
                    "Richard III, King of England from 1483 to 1485 who had to deal with two rebellions during to his reign, died at 22 August 1485"

            } else if (editTextText == "33") {
                textView.text =
                    "Eva Braun, also known as Eva Hitler , she was the companion and brief wife of Nazi dictator Adolf Hitler, died at 30 April 1945"

            } else if (editTextText == "34") {
                textView.text =
                    "Owen Hart, Canadian professional wrestler known as the Blue Blazer and The Golden Nugget, died at 23 May 1999"

            } else if (editTextText == "35") {
                textView.text =
                    "Wolfgang Amadeus Mozart, Considered by most experts to have been a child prodigy and a musical genius, died at 5 December 1791"

            } else if (editTextText == "36") {
                textView.text =
                    "Marilyn Monroe, Icon and sex symbol who starred in the classic comedy Some Like It Hot and became the most famous woman in the world during 1950s, died at 4 August 1962"

            } else if (editTextText == "37") {
                textView.text =
                    "Vincent Van Gogh, Dutch artist whose work became known for its emotional intensity and bold use of color years after his death, died at 29 July 1890"

            } else if (editTextText == "38") {
                textView.text =
                    "Joseph Smith, American religious leader, founder of the Latter Day Saint movement, and translator of the Book of Mormon, died at 27 June 1844"


            } else if (editTextText == "39") {
                textView.text =
                    "Martin Luther King Jr., African-American Civil Rights Movement leader and clergyman who used civil disobedience to combat institutionalised racism, died at 4 April 1968"

            } else if (editTextText == "40") {
                textView.text =
                    "Paul Walker, Actor who won the 2001 Hollywood Breakthrough Award for New Male Stylemaker for his performance as Brian o'Conner in the Fast and the Furious, died at 30 November 2013"

            } else if (editTextText == "41"){
                textView.text = "Harry Clarke,A key memberof the Irish branch of the late 19th and early 20th-century Arts and Crafts Movement, died at 6 January 1931"

            } else if (editTextText == "42"){
                textView.text = "Dodi Fayed, A film producer an dthe son of wealthy businessman Mohamed AI-Fayed, died at 31 August 1997"

            } else if (editTextText == "43"){
                textView.text = "Bessie Smith, Empress of the Blues who sang in the 1920s and 1930s, releasing awar-winning songs like Empty Bed Blues, died at 26 September 1935"

            } else if (editTextText == "44"){
                textView.text = "Balls Mahoney, He made his professional wrestling debuts a 15-year-old and performed on many circuits, died at 12 April 2016"

            } else if (editTextText == "45"){
                textView.text = "Walter Payton, Running back who broke NFL records for the most rushing yards, carries, and touchdowns during his 13-year career with the Chicago Bears"

            } else if (editTextText == "46"){
                textView.text = "George Orwell, British dystopian author best known for the novels Nineteen Eighty-Four and Animal Farm, died at 21 January 1950"

            } else if (editTextText == "47"){
                textView.text = "Mary Anning, Fossil lector, dealer and paleontologist famous for discovering the fossils of the first Ichthyosaur and Plesiosaurus, died at 9 March 1847"

            } else if (editTextText == "48"){
                textView.text = "Whitney Houston, R&B and pop performer who became the most awarded female singer in history, died at 11 February 2012"

            } else if (editTextText == "49"){
                textView.text = "Verne Troye, Actor stuntman who rose to fame for his role as Mini-Me in the Austin Powers franchise, died at 21 April 2018"

            } else if (editTextText == "50"){
                textView.text = "Michael Jackson,The King of Pop who became the most successful singer in American history, died at 25 June 2009"

            } else if (editTextText == "51"){
                textView.text = "Christian Oliver,German-born actor who starred in Saved by the Bell: The New Class and more appeared in the action film, Valkyrie, died a 4 January 2024"

            } else if (editTextText == "52"){
                textView.text = "Luke Terry,Best known for his role as Dylan on the popular television series Beverly Hills, died at 4 March 2019"

            } else if (editTextText == "53"){
                textView.text = "Jackie Robison, First African-American baseball player in the major leagues in the modern era, diad at 24 October 1972"

            } else if (editTextText == "54"){
                textView.text = " Lisa Marie Presley, Her debut album, To WhomIt May Concern, was granted gold status, died at 12 January 2023"

            } else if (editTextText == "55"){
                textView.text = "Henry VIII of England, Second monarch of the Tudor dynasty who reigned from 1509 to 1547 and separated the Church of England from the Roman Catholic Church, died at 28 January 1547"

            } else if (editTextText == "56"){
                textView.text = "Abraham Lincoln,Sixteenth U.S. President who led the country through the horrific American Civil War, died at 15 April 1865"

            } else if (editTextText =="57"){
                textView.text = "Kelly Preston,Actress whose movie credits include Mischief (1985), Jerry Maguire (1996), Jack Frost (1998), and For Love of the Game (1999), died at 12 July 2020"

            } else if (editTextText == "58"){
                textView.text = "Angelica Schuyler Church,The daughter of Continental Army general Philip Schuyler and the sister of Alexander Hamilton's wife, died at 13 March 1814"

            } else if (editTextText == "59"){
                textView.text = "Coolio,He was a rapper best known for the single Gangsta's Paradise, which won the MTV Video Music Award for Best Rap Video in 1996, died at 28 September 2022"

            } else if (editTextText == "60"){
                textView.text = "Carrie Fisher,She soared to fame after portraying Princess Leia Organa in the original Star Wars trilogy from 1977 to 1983, died at 27 December 2016"

            } else if (editTextText == "61"){
                textView.text = "Sally Ride,American astronaut and physicist who joined NASA in 1978 and became the first American woman to enter low-Earth orbit, died at 23 July 2012 "

            } else if (editTextText == "62"){
                textView.text = "Toby Keith,Singer, songwriter, producer, and actor who was named the Country Music Academy Entertainer of the Year in 2002, died at 5 February 2024"

            } else if (editTextText == "63"){
                textView.text = "Audrey Hepburn,Iconic star of Breakfast at Tiffany's who won an Oscar, a BAFTA Award, and a Golden Globe Award for her performance in Roman Holiday, died at 20 January 1993"

            } else if (editTextText == "64"){
                textView.text = "Tiny Tim, he was a ukulele-playing falsetto singer and musical archivist best known for his rendition of the song Tiptoe through Tulips, died at 30 November 1996"

            } else if (editTextText == "65"){
                textView.text = "Walt Disney,Animator, voice actor, producer, and entertainer who founded The Walt Disney Company, died at 15 December 1966"

            } else if (editTextText == "66"){
                textView.text = "Tom Petty, Frontman of rock group Tom Petty and the Heartbreakers, died at 2 Oct 2017"

            } else if (editTextText == "67"){
                textView.text = "George Washington, he served as commander-in-chief of the Continental Army during the Revolutionary War, died at 14 Decemebr 1499"

            } else if (editTextText == "68"){
                textView.text = "Lesley Gore,Pop singer who soared to #1 with her Grammy Award-nominated song It's My Party in 1963, died at 16 February 2015"

            } else if (editTextText == "69"){
                textView.text = "Alan Rickman,Played Severus Snape in the Harry Potter movies and Hans Gruber in the original Die Hard film, died at  14 January 2016"

            } else if (editTextText == "70"){
                textView.text = "PauL Reubens,Comedy actor best known for playing the role of Pee-wee Herman in the 1985 film Pee-wee's Big Adventure and Mickey Mouse Clubhouse, died at 30 July 2 "

            } else if (editTextText == "71"){
                textView.text = "Grover Cleveland,The 22nd and 24th President of the United State who was the only Democrat elected president during the 1861-1913, died at 24 June 1908"

            } else if (editTextText == "72"){
                textView.text = "Tenzing Norgay,Nepalese man who, in 1953, became one of the first two people to reach the summit of Mount Everest,died at 9 May 1986"

            } else if (editTextText == "73"){
                textView.text = "Etta James,Late blues singer who released the hits \"At Last\" and \"Something's Got a Hold on Me\" and won multiple awards,died at20 January 2012"

            } else if (editTextText == "74"){
             textView.text=    "AA MILNE,English author of the famous Winnie-the-Pooh children's books. He also wrote several novels and nearly twenty plays, none of them as famous as his stories about the beloved teddy bear.\n" +
                         "\n,died at 31 January 1956"

            } else if (editTextText == "75"){
                textView.text = "Russi Taylor, Voice actress known for voicing numerous character, died at 26 July 2019"

            } else if (editTextText == "76"){
                textView.text = "Albert Einstein,Iconic genius and legendary theoretical physicist who formulated the Thoery of Relativity and the mass-energy equivalence formular,died at 18 April 1955"

            } else if (editTextText == "77"){
                textView.text = "Dinah Shore,Tv actress and singer ,died at 24 February 1994"

            } else if (editTextText == "78"){
                textView.text = "Coretta Scott King,known as civil right activist and wife of Martin Luther King Jr, died at 30 January 2006"

            } else if (editTextText == "79"){
                textView.text = "Ella Fitzgerald,The Queen of Jazz,died at 15 June 1996"

            } else if (editTextText == "80"){
                textView.text = "Shirley Chisholm,The Politician and Democrat who became the first African-American woman elected to Congress in 1998,died at 1 January 2005"

            } else if (editTextText == "81"){
                textView.text = "Eertha Kitt,known as a singer,actress and cabret star,died at 25 December 2008"

            } else if (editTextText == "82"){
                textView.text = "Franciso Franco,Spanish military general who served as the dictator of his country from 1939 to 1975, died at 20 November 1975"

            } else if (editTextText == "83"){
                textView.text = "Pual Newman,Large-than-life actor who won an Academy Award, died 26 September 2008 "

            } else if (editTextText == "84"){
                textView.text = "Rod Taylor,Actor who gave a memorable perfomance in 1960s,The Time Machine , died at 7 January 2015"

            } else if (editTextText == "85"){
                textView.text = "Agatha Christie,Considered the Queen o Crime, died 12 January 1976 "

            } else if (editTextText == "86"){
                textView.text = "Susan B.Anthony,Suffragette reformer who led protest for women equality,died at 13 March 1906"

            } else if (editTextText == "87"){
                textView.text = "Dr.Seuss,Amercan author and cartoonist,died at 24 September 1991 "

            } else if (editTextText == "88"){
                textView.text = "Mary Trump,British-American mother of Donald Trump, died at 7 August 2000"
            } else if (editTextText == "89") {
                textView.text = "Jane Russel,Star of the Howard Hugher-directer film The Outlaw,died at 28 February 2011"

            } else if (editTextText == "90") {
                textView.text = "Florence,Grand Duchy of Tuscany known of Poineering modern died at 13 August 1910"




            } else {
                    textView.text = "Sorry! I can not generate that information*"

                }

            }

        }

    }






