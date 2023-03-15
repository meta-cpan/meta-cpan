DESCRIPTION = "List::MoreUtils::XS is a backend for List::MoreUtils. Even if it's possible \
(because of user wishes) to have it practically independent from \
List::MoreUtils, it technically depend on "List::MoreUtils". Since it's \
only a backend, the API is not public and can change without any warning."

SECTION = "libs"
LICENSE = "Apache-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/List-MoreUtils-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/List-MoreUtils-XS-0.430.tar.gz"

SRC_URI[md5sum] = "e77113e55b046906aecfb4ddb4f0c662"
SRC_URI[sha256sum] = "e8ce46d57c179eecd8758293e9400ff300aaf20fefe0a9d15b9fe2302b9cb242"
RECOMMENDS += "config-autoconf-perl-native"
RECOMMENDS += "inc-latest-perl-native"
RECOMMENDS += "test-leaktrace-perl-native"

S = "${WORKDIR}/List-MoreUtils-XS-${PV}"

inherit cpan

do_configure() {
	export LD="${CCLD}"
	cpan_do_configure
}

do_compile() {
	export LD="${CCLD}"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
