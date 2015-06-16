DESCRIPTION = "This is a very simple HTTP/1.1 client, designed for doing simple \
requests without the overhead of a large framework like LWP::UserAgent."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTTP-Tiny"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/HTTP-Tiny-0.056.tar.gz"

SRC_URI[md5sum] = "c1a08314c5278e7764bd9b4b95e027bf"
SRC_URI[sha256sum] = "208d5e9013479f7e235bf002cecc8e4704d10b7b64953f302b49fcbf5252d299"
RRECOMMENDS_${PN} += "io-socket-ip-perl"
RRECOMMENDS_${PN} += "io-socket-ssl-perl"
RRECOMMENDS_${PN} += "mozilla-ca-perl"
RRECOMMENDS_${PN} += "net-ssleay-perl"

S = "${WORKDIR}/HTTP-Tiny-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
