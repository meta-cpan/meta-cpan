DESCRIPTION = ""ExtUtils::ParseXS" will compile XS code into C code by embedding the \
constructs necessary to let C functions manipulate Perl values and creates \
the glue necessary to let Perl access those functions. The compiler uses \
typemaps to determine how to map C function parameters and variables to \
Perl values."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-ParseXS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SM/SMUELLER/ExtUtils-ParseXS-3.35.tar.gz"

SRC_URI[md5sum] = "2ae41036d85e98e1369645724962dd16"
SRC_URI[sha256sum] = "41def0511278a2a8ba9afa25ccab45b0453f75e7fd774e8644b5f9a57cc4ee1c"

S = "${WORKDIR}/ExtUtils-ParseXS-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
