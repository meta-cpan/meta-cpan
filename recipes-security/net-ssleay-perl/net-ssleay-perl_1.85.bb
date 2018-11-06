DESCRIPTION = "Net::SSLeay module contains perl bindings to openssl \
(<http://www.openssl.org>) library."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Net-SSLeay"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

DEPENDS = "zlib openssl"
RDEPENDS_${PN} += "zlib libssl libcrypto"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MIKEM/Net-SSLeay-1.85.tar.gz \
    file://no-exec-on-configure.patch \
"

SRC_URI[md5sum] = "d602bdce4e0531c6efc276e3e429ca69"
SRC_URI[sha256sum] = "9d8188b9fb1cae3bd791979c20554925d5e94a138d00414f1a6814549927b0c8"

S = "${WORKDIR}/Net-SSLeay-${PV}"

inherit cpan

do_configure() {
	export OPENSSL_PREFIX="${STAGING_EXECPREFIXDIR}"
	cpan_do_configure
}

BBCLASSEXTEND = "native"
