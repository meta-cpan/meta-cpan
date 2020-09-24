DESCRIPTION = "The "File::LibMagic" module is a simple perl interface to libmagic from the \
file package (version 4.x or 5.x). You will need both the library \
(libmagic.so) and the header file (magic.h) to build this Perl module."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-LibMagic"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/File-LibMagic-1.23.tar.gz"

SRC_URI[md5sum] = "7782e6f80a67c931a2682145eca6e832"
SRC_URI[sha256sum] = "52e6b1dc7cb2d87a4cdf439ba145e0b9e8cf28cc26a48a3cf9977c83463967ee"
DEPENDS += "config-autoconf-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "file"

S = "${WORKDIR}/File-LibMagic-${PV}"

inherit cpan

do_configure() {
	export LD="${CCLD}"
	cpan_do_configure
}

do_compile() {
	export LD="${CCLD}"
	cpan_do_compile
}

do_install() {
	export LD="${CCLD}"
	cpan_do_install
}

BBCLASSEXTEND = "native"
