DESCRIPTION = "Given a list of Perl modules/filenames, this module makes "require" and \
"use" statements fail (no matter the specified files/modules are installed \
or not)."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-Hide"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DC/DCANTRELL/Devel-Hide-0.0013.tar.gz"

SRC_URI[md5sum] = "c43727f104694215dd9f593c85641542"
SRC_URI[sha256sum] = "6fc3bbcf4f0253a6e5168296c909938c13c886923a7995ac969e47adfcf07ecb"

S = "${WORKDIR}/Devel-Hide-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
