DESCRIPTION = ""ExtUtils::CppGuess" attempts to guess the system's C++ compiler that is \
compatible with the C compiler that your perl was built with."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-CppGuess"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETJ/ExtUtils-CppGuess-0.12.tar.gz"

SRC_URI[md5sum] = "28be49072585b25df87e54180f741a4d"
SRC_URI[sha256sum] = "31c47b5b15e3e9fd5ae7b35881a0fffd26a2983b241e7e3a1bc340d6d446186b"
RDEPENDS_${PN} += "capture-tiny-perl"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/ExtUtils-CppGuess-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
