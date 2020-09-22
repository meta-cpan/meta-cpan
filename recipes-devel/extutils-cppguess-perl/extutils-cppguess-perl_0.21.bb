DESCRIPTION = ""ExtUtils::CppGuess" attempts to guess the system's C++ compiler that is \
compatible with the C compiler that your perl was built with."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-CppGuess"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETJ/ExtUtils-CppGuess-0.21.tar.gz"

SRC_URI[md5sum] = "62bdf731bcbe988d07486836e11585f7"
SRC_URI[sha256sum] = "ff629178321a1e591b83f809712593eae4408a413aa448654bce59b156f24153"
RDEPENDS_${PN} += "capture-tiny-perl"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/ExtUtils-CppGuess-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
