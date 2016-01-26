DESCRIPTION = "\"ExtUtils::ParseXS\" will compile XS code into C code by embedding the \
constructs necessary to let C functions manipulate Perl values and creates \
the glue necessary to let Perl access those functions. The compiler uses \
typemaps to determine how to map C function parameters and variables to \
Perl values."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-ParseXS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SM/SMUELLER/ExtUtils-ParseXS-3.30.tar.gz"

SRC_URI[md5sum] = "db1d2dffcf538c9b49701d8aa2aea7fa"
SRC_URI[sha256sum] = "777b991ccb950845f384420e21dea43df5e95ca93848757ccce9496ac66daa25"

S = "${WORKDIR}/ExtUtils-ParseXS-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
