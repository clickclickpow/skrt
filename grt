local Players = game:GetService("Players")
local LocalPlayer = Players.LocalPlayer
local Character = LocalPlayer.Character
local HumanoidRootPart = Character and Character:FindFirstChild("HumanoidRootPart")
local Magi = 2000
local Target

   for i,v in ipairs(Players:GetPlayers()) do
       if v ~= LocalPlayer and v.Character and v.Character:FindFirstChild("HumanoidRootPart") then
           local tg = v.Character.HumanoidRootPart
           local mag = (HumanoidRootPart.Position - tg.Position).magnitude
           if mag < Magi then
               local Players = game:GetService("Players")
local function RemoveSpaces(String)
    return String:gsub("%s+", "") or String
end

local function FindPlayer(String)
    String = RemoveSpaces(String)
    for _, _Player in pairs(Players:GetPlayers()) do
        if _Player.Name:lower():match('^'.. String:lower()) then
            return _Player
        end
    end
    return nil
end

targetname = v.Name 

for i = 1,1 do
wait(0)

local tbl_main = 
{
      "slash", 
      1,  
      game:GetService("Workspace")[targetname].Humanoid, 
      game:GetService("Workspace")[targetname].HumanoidRootPart, 
      game:GetService("Workspace")[targetname].Effects, 
      game:GetService("Workspace")[targetname].RightHand, 
      4, 
      "explosion",
}
game:GetService("ReplicatedStorage").Events.dmg:FireServer(unpack(tbl_main))
end
               
           end
       end
   end

   return Target
