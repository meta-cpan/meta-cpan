DESCRIPTION = "This pragma provides an easy and convenient way to enable or disable \
experimental features."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/experimental"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/experimental-0.020.tar.gz"

SRC_URI[md5sum] = "ba22ff582a7b55f5229d6ba4fe230632"
SRC_URI[sha256sum] = "bb223dd1749c6777db41a77bcd4e963b40d183c3cf00cd6b34259a01006a2ac4"

S = "${WORKDIR}/experimental-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
