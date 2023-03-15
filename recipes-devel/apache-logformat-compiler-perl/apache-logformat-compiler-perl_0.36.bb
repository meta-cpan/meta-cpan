DESCRIPTION = "Compile a log format string to perl-code. For faster generation of \
access_log lines."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Apache-LogFormat-Compiler"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/Apache-LogFormat-Compiler-0.36.tar.gz"

SRC_URI[md5sum] = "a0cdfcd875cb2ee4dc9a2c24381eb55b"
SRC_URI[sha256sum] = "94509503ee74ea820183d070c11630ee5bc0fd8c12cb74fae953ed62e4a1ac17"
RDEPENDS:${PN} += "posix-strftime-compiler-perl"
DEPENDS += "http-message-perl-native"
DEPENDS += "module-build-tiny-perl-native"
DEPENDS += "test-mocktime-perl-native"
DEPENDS += "test-requires-perl-native"
DEPENDS += "try-tiny-perl-native"
DEPENDS += "uri-perl-native"

S = "${WORKDIR}/Apache-LogFormat-Compiler-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
