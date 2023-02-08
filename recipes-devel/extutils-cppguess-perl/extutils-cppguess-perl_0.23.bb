DESCRIPTION = ""ExtUtils::CppGuess" attempts to guess the system's C++ compiler that is \
compatible with the C compiler that your perl was built with."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-CppGuess"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETJ/ExtUtils-CppGuess-0.23.tar.gz"

SRC_URI[md5sum] = "41d512881235b2bbce98e5f7b6019df4"
SRC_URI[sha256sum] = "f96c48984eb6d8efb7d933b34f361d0c8b38335e3e5382e9aeccc0aa519a002c"
RDEPENDS:${PN} += "capture-tiny-perl"
DEPENDS += "module-build-perl-native"

S = "${WORKDIR}/ExtUtils-CppGuess-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
