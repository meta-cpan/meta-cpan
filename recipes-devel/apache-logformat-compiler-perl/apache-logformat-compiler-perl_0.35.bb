DESCRIPTION = "Compile a log format string to perl-code. For faster generation of \
access_log lines."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Apache-LogFormat-Compiler"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/Apache-LogFormat-Compiler-0.35.tar.gz"

SRC_URI[md5sum] = "cbb0bf041ade8a39f65eadbdf8a346c1"
SRC_URI[sha256sum] = "1654c0000a042a8af052616e30b91c1f0b95a720c8048b59168a8bd99b07271a"
RDEPENDS_${PN} += "posix-strftime-compiler-perl"
DEPENDS += "http-message-perl-native"
DEPENDS += "module-build-tiny-perl-native"
DEPENDS += "test-mocktime-perl-native"
DEPENDS += "test-requires-perl-native"
DEPENDS += "try-tiny-perl-native"
DEPENDS += "uri-perl-native"

S = "${WORKDIR}/Apache-LogFormat-Compiler-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
