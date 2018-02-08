def getName
  puts "Please enter your name"
  $name = gets
end

getName

puts "\nHi there #{$name}\nHope you are well."

def generateRandomNumber
  $random = rand(1..100)
end

generateRandomNumber

puts "the secret number is: #{$random}"

puts "Try to guess the number between 1 and 100"

$tries = 9

def howManyTriesLeft
  puts "You have #{$tries} left"
end

while $tries > 0 do
  puts "Please provide number"
  _numStr = gets
  _num = _numStr.to_i
  
  if _num > $random 
      puts "Too HIGH!"
      howManyTriesLeft
  elsif _num < $random
    puts "Too LOW"
    howManyTriesLeft
  else 
    puts "OMG #{$name} you guessed the correct number. You guessed the number after only #{10 - $tries} tries"
    break
  end
   $tries -= 1
end

  


