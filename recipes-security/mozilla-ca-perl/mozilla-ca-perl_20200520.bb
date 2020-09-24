DESCRIPTION = "Mozilla::CA provides a copy of Mozilla's bundle of Certificate Authority \
certificates in a form that can be consumed by modules and libraries based \
on OpenSSL."

SECTION = "libs"
LICENSE = "MPLv2"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Mozilla-CA"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MPL-2.0;md5=815ca599c9df247a0c7f619bab123dad"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AB/ABH/Mozilla-CA-20200520.tar.gz"

SRC_URI[md5sum] = "8ac3fe1a83c45da3f468f78ab8133ea6"
SRC_URI[sha256sum] = "b3ca0002310bf24a16c0d5920bdea97a2f46e77e7be3e7377e850d033387c726"

S = "${WORKDIR}/Mozilla-CA-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
