DESCRIPTION = "This module provides one function, "equals" (not exported by default)."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/String-Compare-ConstantTime"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/F/FR/FRACTAL/String-Compare-ConstantTime-0.320.tar.gz"

SRC_URI[md5sum] = "e2b865cef8baad19c1cd5cfa166e74f9"
SRC_URI[sha256sum] = "fc4f73e81514095e445c96aedb76600c6365153dc54cd8711844a21e636d1952"

S = "${WORKDIR}/String-Compare-ConstantTime-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
