#!/bin/bash
echo "Cloning Yocto Base and Layers..."

git clone -b kirkstone https://git.yoctoproject.org/poky
git clone -b kirkstone https://github.com/openembedded/meta-openembedded.git sources/meta-openembedded
git clone -b master https://github.com/sbabic/meta-swupdate.git sources/meta-swupdate

echo "✅ Yocto base and layers cloned."
